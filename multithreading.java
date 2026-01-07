public class multithreading extends Thread{
    int tnumber ;
    public  multithreading(int tnumber){
        this.tnumber = tnumber ;
    }
    @Override 
    public void run(){
        for(int i = 1 ; i < 5 ; i++){ 
            if(tnumber == 3){
                throw new RuntimeException();
            }
            System.out.println("the print by thread " +i +"  : "+ tnumber );
           
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
            }
        }
    }
    public static void main(String[] args){
        for(int i = 1 ; i<=5 ; i++){
            multithreading my = new multithreading(i) ;
            my.start();

        }
   
    }
    
}
    