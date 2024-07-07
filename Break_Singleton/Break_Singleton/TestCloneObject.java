package Break_Singleton;

public class TestCloneObject {
    public static void main(String[] args) throws CloneNotSupportedException{
        CloneObject cloneObject = CloneObject.getDeserObjThreadSafeOptimized();
        System.out.println(" Hash code of cloneObject :: "+ cloneObject.hashCode());

        CloneObject cloneObject2 =(CloneObject) cloneObject.clone();
        System.out.println("Hash code of clonable object :: "+ cloneObject2.hashCode());
    }

}
