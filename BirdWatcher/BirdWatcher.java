package BirdWatcher;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {

        if(this.birdsPerDay.length == 0) {
            return 0;
        }
        
        return this.birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int day: this.birdsPerDay) {
            if(day == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdsInAnInterval = 0;

        if(numberOfDays >= this.birdsPerDay.length) {
            for(int i = 0; i < 7; i++) {
                birdsInAnInterval += this.birdsPerDay[i];
            }

            return birdsInAnInterval;
        }
        
        for(int i = 0; i < numberOfDays; i++) {
            birdsInAnInterval += this.birdsPerDay[i];
        }

        return birdsInAnInterval;
    }

    public int getBusyDays() {
        int bussyDays = 0;

        if(this.birdsPerDay.length == 0) {
            return bussyDays;
        }
        
        for(int day: this.birdsPerDay) {
            if(day >= 5) {
                bussyDays++;
            }
        }

        return bussyDays;
    }
}
