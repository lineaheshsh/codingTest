class UndergroundSystem {
    Map<Integer, Passenger> passengerMap;
    Map<String, PassengerHistory> passengerHistoryMap;

    public UndergroundSystem() {
        passengerMap = new HashMap<>();
        passengerHistoryMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        Passenger passenger = new Passenger(id, stationName, t);
        passengerMap.put(id, passenger);
    }

    public void checkOut(int id, String stationName, int t) {
        if (passengerMap.containsKey(id)) {
            int diff = t - passengerMap.get(id).getT();
            String key = passengerMap.get(id).getStartStation() + "," + stationName;

            PassengerHistory passengerHistory = passengerHistoryMap.containsKey(key) ? passengerHistoryMap.get(key) : new PassengerHistory();
            passengerHistory.update(diff);
                
            passengerHistoryMap.put(key, passengerHistory);
            
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "," + endStation;
        return passengerHistoryMap.get(key).avg();
    }
    
    public static class Passenger {
        private int id;
        private String startStation;
        private String endStation;
        private int t;

        public Passenger(int id, String startStation, int t) {
            this.id = id;
            this.startStation = startStation;
            this.t = t;
        }

        public int getId() {
            return id;
        }

        public String getStartStation() {
            return startStation;
        }

        public String getEndStation() {
            return endStation;
        }

        public int getT() {
            return t;
        }
    }

    public static class PassengerHistory {
        private int total;
        private int cnt;

        public void update(int time) {
            total += time;
            cnt++;
        }

        public double avg() {
            return (double) total / cnt;
        }
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */