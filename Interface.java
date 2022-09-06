interface Inter{
    void connect();
    void disconnect();
}

class OracleDB implements Inter{
    public void connect(){
        System.out.println("Connect Oracle");
    }
    public void disconnect(){
        System.out.println("OracleDB disconnect");
    }
}

class Sybase implements Inter{
    public void connect(){
        System.out.println("Connect Sybase");
    }
    public void disconnect(){
        System.out.println("Sybase disconnect");
    }
}

public class Interface{
    public static void main(String[] args) throws Exception{

        Class C=Class.forName(args[0]);
        Inter i=(Inter)C.newInstance();

        i.connect();
        i.disconnect();
    }
}
