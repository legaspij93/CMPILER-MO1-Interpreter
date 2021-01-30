package execution;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExecutionMonitor {
    private boolean execFlag = true;

    private final Lock lock = new ReentrantLock();
    private final Condition execGate = lock.newCondition();

    public void tryExecution() throws InterruptedException{
        this.lock.lock();

        try{
            while(execFlag == false){
                System.out.println("Flag is false.");
                this.execGate.await();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void claimExecutionFlag(){
        this.execFlag = false;
    }

    public void releaseExecutionFlag(){
        this.lock.lock();
        this.execFlag = true;
        this.execGate.signal();
        this.lock.unlock();
    }
}
