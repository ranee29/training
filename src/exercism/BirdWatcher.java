package exercism;


import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if(birdsPerDay.length == 0 ){
            return 0;
        }else {
            return birdsPerDay[birdsPerDay.length - 1 ];
        }
    }

    public void incrementTodaysCount() {
        //get the index of today
        int index = birdsPerDay.length-1;
        birdsPerDay[index]++;
        System.out.println(birdsPerDay[index]);
    }

    public boolean hasDayWithoutBirds() {
        for(int a = 0; a<birdsPerDay.length;a++){
            if(birdsPerDay[a] == 0){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
            return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
    }

    public int getBusyDays() {
        int count=0;
        for (int a = 0; a <=birdsPerDay.length-1; a++){
            if(5<=birdsPerDay[a]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[]args){
        int[] b = {0, 2, 5, 3, 7, 8, 4};
        BirdWatcher bw = new BirdWatcher(b);
        System.out.println(bw.getToday());
        bw.incrementTodaysCount();
        System.out.println("No birds: "+bw.hasDayWithoutBirds());
        System.out.println("Sum: "+ bw.getCountForFirstDays(2));
        System.out.println(bw.getBusyDays());
    }
}
