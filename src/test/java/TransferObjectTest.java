import TransferObject.*;
import Worker.*;
import org.junit.Test;
public class TransferObjectTest {
    @Test
    public void main(){
        WorkerBO WorkerBusinessObject=new WorkerBO();
        for(int i=0;i<3;i++){
            WorkerBusinessObject.addWorker(new Worker(new AttributeCreate().randomAttribute()));
        }
        WorkerBusinessObject.getAllWorker();
        Worker w1=WorkerBusinessObject.getWorker(1);
        WorkerBusinessObject.setBirthTime(w1.GetId(),"1991");
        Worker w2=WorkerBusinessObject.getWorker(2);
        Worker w3=new Worker(new Attribute(w2.GetId(),"1989","女",3990.25));
        WorkerBusinessObject.updateWorker(w3);
        System.out.println();
        WorkerBusinessObject.getAllWorker();
    }
}
