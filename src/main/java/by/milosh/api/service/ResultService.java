package by.milosh.api.service;

import by.milosh.api.Platform;
import by.milosh.api.oop.*;

public class ResultService {

    private static final int FIRST_SEQUENCE_ELEMENT = 0;

    private Step step;
    private Value value;
    private Position position;
    private Proxy proxy;
    private Looping looping;


    public ResultService() {
    }

    public int getNumberOfSteps(Platform platform) {
        step = new Step();

        value = new Value();
        value.setValueOfArrayElement(platform.getSequenceNumber()[FIRST_SEQUENCE_ELEMENT]);

        position = new Position();

        proxy = new Proxy();
        proxy.initProxySequence(platform.getSequenceNumber());

        looping = new Looping();
        looping.setLoop(true);

        // танцор будет совершать шаги до тех пор, пока он может делать следующий шаг
        // и пока мы не определили, что есть зацикливание
        while (isCanNextStep(value.getValueOfArrayElement(), position.getPositionInArray(), platform.getSize()) & (looping.isLoop() == true)) {
            proxy.getProxySequence()[position.getPositionInArray()] = true;

            changeData(value, platform);

            // если следующий шаг танцор пытается совершить на ячейку, на которой он уже был, значит алгоритм зациклен
            if (proxy.getProxySequence()[position.getPositionInArray()] == true) {
                looping.setLoop(false);
                //loop = false;
            }
        }

        // к пройденным шагам добавляем шаги, чтобы вернуться в начало площадки
        step.increaseSteps(position.getPositionInArray());


        // если было зацикливание - возвращем '-1', иначе возвращаем количество шагов
        if (looping.isLoop() == false) {
            return -1;
        } else {
            return step.getSteps();

        }
    }

    void changeData(Value val, Platform platform) {
        if ((val.getValueOfArrayElement() % 2) == 0) {
            step.increaseSteps(val.getValueOfArrayElement());
            position.changePosition(val.getValueOfArrayElement());
            value.setValueOfArrayElement(platform.getSequenceNumber()[position.getPositionInArray()]);

        } else if ((val.getValueOfArrayElement() % 2) != 0) {
            step.increaseSteps(val.getValueOfArrayElement());
            position.changePosition(val.getValueOfArrayElement()*(-1));
            value.setValueOfArrayElement(platform.getSequenceNumber()[position.getPositionInArray()]);
        }
    }

    boolean isCanNextStep(int value, int point, int size) {
        boolean canStep = true;
        if (value == 0) {
            canStep = false;
        } else if ((value % 2) == 0) {
            if ((size - point) <= value) {
                canStep = false;
            }
        } else if ((value % 2) != 0) {
            if (value > point) {
                canStep = false;
            }
        }
        return canStep;
    }
}
