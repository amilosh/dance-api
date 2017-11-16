package by.milosh.api;

public class Result implements TaskResult {

    // ~ Instance fields
    // ================================================================================================
    private int steps;

    // ~ Constructors
    // ===================================================================================================
    public Result() {
    }

    // ~ Methods
    // ========================================================================================================
    public int getSteps() {
        return steps;
    }

    /**
     * Метод который вычисляет колчисетво шагов, которые пройдёт танцор.
     * И устанавливает это значение в поле steps.
     *
     * @param dancer dancer who takes part in competitions
     * @param platform platform with it sequence number
     */
    public void setSteps(Dancer dancer, Platform platform) {
        this.steps = getNumberOfSteps(platform.getSequenceNumber());
    }

    /**
     * Метод который вычисляет колчисетво шагов, которые пройдёт танцор.
     *
     * @param sequence real numberSequence[] of platform
     * @return number of steps
     */
    private static int getNumberOfSteps(int[] sequence) {
        int steps = 0;
        int value = sequence[0];
        int point = 1;
        int size = sequence.length;
        // перменная для определения зацикливания
        boolean loop = true;

        boolean[] proxySequence = initProxySequence(sequence);

        // танцор будет совершать шаги до тех пор, пока он может делать следующий шаг
        // и пока мы не определили, что есть зацикливание
        while (isCanNextStep(value, point, size) & (loop == true)) {
            // после каждого прохождения цифры ставим true в соответсвующую ячейку proxySequence
            proxySequence[point - 1] = true;

            if ((value % 2) == 0) {
                steps = steps + value;
                point = point + value;
                value = sequence[point - 1];
            } else if ((value % 2) != 0) {
                steps = steps + value;
                point = point - value;
                value = sequence[point - 1];
            }

            // если следующий шаг танцор пытается совершить на ячейку, на которой он уже был, значит алгоритм зациклен
            if (proxySequence[point - 1] == true) {
                loop = false;
            }
        }

        // к пройденным шагам добавляем шаги, чтобы вернуться в начало площадки
        steps = steps + point -1 ;

        // если было зацикливание - возвращем '-1', иначе возвращаем количество шагов
        if (loop == false) {
            return -1;
        } else {
            return steps;
        }

    }

    /**
     * Метод, который определяет, может ли танцор совершить следующий шаг.
     *
     * @param value value of number in sequence number
     * @param point current position in sequenceNumber[]
     * @param size size of sequenceNumber[]
     * @return true if dancer can next step, and false if dancer can't next step
     */
    static boolean isCanNextStep(int value, int point, int size) {
        boolean canStep = true;
        if (value == 0) {
            canStep = false;
        } else if ((value % 2) == 0) {
            if ((size - point) < value) {
                canStep = false;
            }
        } else if ((value % 2) != 0) {
            if (value >= point) {
                canStep = false;
            }
        }
        return canStep;
    }

    /**
     * Метод, который создаёт proxy коллекцию булевскиз значений false.
     * После каждой итерации танцора идентификатор из sequenceNumber ставится в соответсвие идентификатору в proxySequence
     * и записывается значение true.
     * Это означает, что танцор уже был на этой позиции.
     * Если танцор попадает на позицию, которая уже помечена как true,
     * значит он на ней уже был.
     * Знчит алгоритм зациклен.
     *
     * @param sequence real sequence param
     * @return roxy sequence param with all values false
     */
    private static boolean[] initProxySequence(int[] sequence) {
        boolean[] proxy = new boolean[sequence.length];
        for (boolean bool : proxy) {
            bool = false;
        }
        return proxy;
    }


}
