package train2;

public abstract class CalendarUnit {
    protected int currentPos;

    protected void setCurrentPos(int currentPos) {
        this.currentPos = currentPos;
    }

    protected int getCurrentPos() {
        return currentPos;
    }

    protected abstract boolean increment();
    protected abstract boolean isValid();
}
