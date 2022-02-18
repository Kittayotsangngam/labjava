class Stopwatch {
    private Long Start;
    private Long End;
   
    public Stopwatch()
    {
        this.Start=System.currentTimeMillis();
    }
   
    public void start()
    {
        this.Start =System.currentTimeMillis();
    }
    public void stop()
    {
        this.End=System.currentTimeMillis();
    }
    public long GetElapsedTime(){
        return this.End-this.Start;
    }
   
   }