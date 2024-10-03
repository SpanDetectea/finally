package view;
class Counter implements AutoCloseable {
    private int count;
    private boolean isResourceClosed;

    public Counter() {
        this.count = 0;
        this.isResourceClosed = false;
    }

    // Метод увеличения счетчика
    public void add() {
        if (isResourceClosed) {
            throw new IllegalStateException("Resource is already closed!");
        }
        count++;
        System.out.println("Counter: " + count);
    }

    // Закрытие ресурса
    @Override
    public void close() {
        if (isResourceClosed) {
            throw new IllegalStateException("Resource is already closed!");
        }
        isResourceClosed = true;
        System.out.println("Resource closed.");
    }
}
