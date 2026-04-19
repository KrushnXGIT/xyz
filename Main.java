class normal implements Runnable {
    /**
     *
     */
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Krushna");

        }
    }


    public static void main(String[] args){
        normal n = new normal();
        n.run();

    }
}