package interpreter.execution;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExecutionMonitor {

    private boolean flag = true;

    private final Lock lock = new ReentrantLock();
    private final Condition execGate = lock.newCondition();

    public ExecutionMonitor(){

    }

    public void tryExec() throws InterruptedException{
        this.lock.lock();

        try{
            while(flag == false){
                System.err.println("Execution flag has been set to false. Execution sleeps.");
                this.execGate.await();
            }
        }
        finally {
            this.lock.unlock();
        }
    }

    public void claimExecFlag(){
        this.flag = false;
    }

    public void releaseExecFlag(){
        this.lock.lock();
        this.flag = true;
        this.execGate.signal();
        this.lock.unlock();
    }
}
