package main;

public class CoarseGrainedObject {

    DependentObject1 dependentObject1 = new DependentObject1();
    DependentObject2 dependentObject2 = new DependentObject2();

    public void setData(String data1, String data2){
        dependentObject1.setData(data1);
        dependentObject2.setData(data2);
    }

    public String[] getData(){
        return new String[] {dependentObject1.getData(), dependentObject2.getData()};
    }
}
