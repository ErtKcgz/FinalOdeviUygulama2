package finalödev;
public class Finalödev {
    public static void main(String[] args ) {
        kopek kopek1 =new kopek();
        kopek1.setYavru("feratlar ve küpekler giremez");
        System.out.println(kopek1.getYavru());
    }    
    public static class kopek{
    private String yavru;
    public void setYavru (String deger){
        yavru = deger;
    }
    public String getYavru(){
        return yavru;
    }
    }
}

