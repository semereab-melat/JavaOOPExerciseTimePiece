class Main {
  public static void main(String[] args) {

        TimePiece myWatch = new TimePiece( "Watch",12.99, 9,45, "Digital Watch" ,true);
        TimePiece bigBen = new TimePiece("Clock" , 100000, "Analog", false);
        System.out.println(myWatch);
        System.out.println("************");
        System.out.println(bigBen);
        System.out.println("************");
        System.out.println(myWatch.showTime());
        System.out.println("************");
        System.out.println( bigBen.showTime());
        System.out.println("************");
        myWatch.setHours(10);
        myWatch.setMinutes(50);
        System.out.println(myWatch.showTime());
        System.out.println("************");
        bigBen.setTimeType(22,55);
        System.out.println(bigBen.showTime());
        bigBen.updateTime(2,10);
        System.out.println("************");
        System.out.println(bigBen.showTime());
        System.out.println("************");
        bigBen.updateTime(2,10);
        System.out.println("************");
        bigBen.showTime();
    
  }
}