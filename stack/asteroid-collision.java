class Solution {
    public int[] asteroidCollision(int[] asteroids) {
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
        if(stack.isEmpty()){
            return new int[0];
        }
        int[] arr = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            arr[i] = stack.get(i); 
        }

        return arr;
    }
}