class Continue{
    public static void main(String[] args)
    {
        int j;
        for(j=1;j<=5;j++)
        {
            if(j==2)
            {
                continue;
            }
            System.out.println(j);
        }
    }
}