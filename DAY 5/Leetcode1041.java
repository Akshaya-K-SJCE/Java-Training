class Solution
{
    public boolean isRobotBounded(String instructions) {
        int x=0;
        int y=0;
        int i=0;
        for(char ch:instructions.toCharArray())
        {
            if(ch=='L')
            {
                i=(i+1)%4;
                
            }
            else if(ch=='R')
            {
                i=(i+3)%4;
            }
            else
            {
                if(i==0)
                {
                    y++;
                }
                else if(i==1)
                {
                    x--;
                }
                else if(i==2)
                {
                    y--;
                }
                else
                {
                    x++;
                }
            }

            
        }
        return (x==0 && y==0)||(i!=0);
    }
}
