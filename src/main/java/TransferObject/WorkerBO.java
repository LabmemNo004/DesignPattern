package TransferObject;

import Iterator.*;
import Worker.*;

import java.text.DecimalFormat;

public class WorkerBO {
    private ObjectCollection<Worker>workerCollection;
    private Iterator<Worker>iter;
    public WorkerBO(){
        System.out.println("======== 使用传输对象 Transfer Object 模式 ========");
        System.out.println("创建一个工人信息传输对象!");
        workerCollection=new ObjectCollection<Worker>();
        iter=workerCollection.iterator();
    }
    public void addWorker(Worker w){
        workerCollection.add(w);
    }
    public void deleteWorker(Worker w){
        workerCollection.delete(w);
    }
    public Worker getWorker(String id){
        iter.reset();
        while(iter.hasNext()){
            Worker w=iter.next();
            if(id.equals(w.GetId())){
                return w;
            }
        }
        System.out.println("不存在该工人!");
        return null;
    }
    public Worker getWorker(int index){
        iter.reset();
        int count=0;
        while (iter.hasNext()&&count!=index){
            iter.next();
            count++;
        }
        if(count==index){
            return iter.next();
        }
        else{
            System.out.println("Index out of range!");
            return null;
        }
    }
    public void setBirthTime(String id,String time){
        Worker w=getWorker(id);
        if(w==null){
            return;
        }
        w.setBirthTime(time);
    }
    public void setSalary(String id,double s){
        Worker w=getWorker(id);
        if(w==null){
            return;
        }
        w.SetSalary(s);
    }
    public void setSex(String id,String sex){
        Worker w=getWorker(id);
        if(w==null){
            return;
        }
        w.setSex(sex);
    }
    public void updateWorker(Worker w){
        String id=w.GetId();
        if(getWorker(id)==null){
            return;
        }
        setBirthTime(id,w.GetBirthTime());
        setSalary(id,w.GetSalary());
        setSex(id,w.GetSex());
        System.out.println("更新");
        System.out.println("Worker:"+id+"的信息");
        System.out.println("更新后，该工人信息如下:");
        System.out.println("Id:"+id);
        System.out.println("BirthYear:"+w.GetBirthTime());
        System.out.println("Sex:"+w.GetSex());
        System.out.println("Salary:"+w.GetSalary());
    }
    public void getAllWorker(){
        iter.reset();
        Worker w;
        DecimalFormat df=new DecimalFormat("#.00");
        if(iter.hasNext()){
            System.out.println("======通过传输对象 Transfer Object 模式获得工人基本信息如下=====");
        }
        else{
            System.out.println("当前还不存在工人!");
        }
        while(iter.hasNext()){

            System.out.println("工人"+(iter.getPoint()+1));
            w= iter.next();
            System.out.println("Id:"+w.GetId());
            System.out.println("BirthYear:"+w.GetBirthTime());
            System.out.println("Sex:"+w.GetSex());
            System.out.println("Salary:"+df.format(w.GetSalary()));
            System.out.println();
        }
    }

}
