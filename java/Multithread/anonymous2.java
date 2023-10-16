class anonymous2{ ///This is Another method of Anonymous class
    public static void main(String[] args) {
        new Thread(new Runnable(){
        
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }
}