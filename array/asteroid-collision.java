class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // TC->O(N)
        // SC->O(N)
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            boolean alive = true;
            while (asteroids[i] < 0 && !stack.isEmpty() && stack.peek()>0) {
                if ((asteroids[i] * -1) > stack.peek()) {
                    stack.pop();
                } else if ((asteroids[i] * -1) == stack.peek()) {
                    stack.pop();
                   alive = false;
                    break;
                }else{
                    alive = false;
                    break;
                }
            }
            if(alive){
            stack.push(asteroids[i]);
            }
        }
       int size = stack.size();
        int[] arr = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }

        return arr;
    }
}