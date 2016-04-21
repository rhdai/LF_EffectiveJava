package Chapter2.Item3.method;


// Singleton with static factory - Page 17

public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() { }
    public static Elvis getInstance() { return INSTANCE; }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    // This code would normally appear outside the class!
    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        System.out.println("getinstance and static final INSTANCE is same:"+(elvis==Elvis.INSTANCE));
        System.out.println("2 times getInstance is same :"+(elvis==Elvis.getInstance()));
        elvis.leaveTheBuilding();
    }
}
