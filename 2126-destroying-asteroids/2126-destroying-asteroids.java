class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n = asteroids.length;
        Arrays.sort(asteroids);

        long currentMass = mass;
        
        for(int i = 0; i < n; i++){
            if (currentMass < asteroids[i]) {
                return false;
            }
            currentMass += asteroids[i];
        }

        return true;
    }
}