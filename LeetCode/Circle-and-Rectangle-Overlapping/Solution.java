1class Solution {
2    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
3        // Find the closest point on the rectangle to the circle's center
4        int closestX = Math.max(x1, Math.min(xCenter, x2));
5        int closestY = Math.max(y1, Math.min(yCenter, y2));
6        
7        // Calculate the distance from the circle's center to this closest point
8        int distanceX = xCenter - closestX;
9        int distanceY = yCenter - closestY;
10        
11        // Compare squared distance with squared radius to avoid floating-point inaccuracies
12        int distanceSquared = (distanceX * distanceX) + (distanceY * distanceY);
13        
14        return distanceSquared <= (radius * radius);
15    }
16}