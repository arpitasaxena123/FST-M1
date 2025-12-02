package examples;

class Activity3 {
    public static void main(String[] args) {
        
        double seconds = 1_000_000_000;
        double earthYearInSeconds = 31557600;

        String[] planets = {
            "Mercury", "Venus", "Earth", "Mars", 
            "Jupiter", "Saturn", "Uranus", "Neptune"
        };

        double[] orbitalPeriods = {
            0.2408467, 0.61519726, 1.0, 1.8808158, 
            11.862615, 29.447498, 84.016846, 164.79132
        };

        for (int i = 0; i < planets.length; i++) {
            double age = (seconds / earthYearInSeconds) / orbitalPeriods[i];
            System.out.println("Age on " + planets[i] + ": " + age);
        }
    }
}