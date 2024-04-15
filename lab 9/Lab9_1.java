public class Lab9_1{
    public static void main(String[] args) {
        try {
            Thread1 t1 = new Thread1();
            t1.start();
            t1.join();
            Thread2 t2 = new Thread2();
            t2.start();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
    class Thread1 extends Thread{
        public void run(){
            try {
                for(int i=0;i<10;i++){
                    System.out.println("good morning");
                    Thread.sleep(1000);
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
           
        }
    }    
    class Thread2 extends Thread{
        public void run(){
            try {
                for(int i=0;i<10;i++){
                    System.out.println("good afternoon");
                    Thread.sleep(3000);
                }
                
            } 
            catch (Exception e) {
             e.printStackTrace();
            }
            
        }
    }    
