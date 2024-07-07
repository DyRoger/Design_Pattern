package Break_Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDeserObject {
    public static void main(String[] args) {
        try{
            DeserObject deserObject = DeserObject.getDeserObjThreadSafeOptimized();

            System.out.println("hash Code of deserobject :: "+ deserObject.hashCode());
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testdesobj.ob"));
            oos.writeObject(deserObject);
            System.out.println("Serialization done");
            System.out.println();
    
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("testdesobj.ob"));
            DeserObject des = (DeserObject) objectInputStream.readObject();
            System.out.println("Deserialization done");
            System.out.println("Hash code of deserobject :: "+ des.hashCode());

        } catch (Exception e){
            System.out.println("Exception occured :: "+ e.getMessage());
        }
    }
}

