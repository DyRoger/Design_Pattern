package Create_Singleton;
/**
 * Create a singletion class with eager way of initialization.
 */
public class MobilePhone {
    private static MobilePhone mobilePhone = new MobilePhone();

    private MobilePhone(){
    }

    public static MobilePhone getMobilePhone(){
        return mobilePhone;
    }
}
