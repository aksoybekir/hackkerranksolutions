// Write your Student class here
class Student {
    private:
        vector <int> scores;
    
    public:
        void input(){
           for(int i=0; i<5; i++)
           {
               int s;
               cin>>s;
               scores.push_back(s);
           }
        }
    
    int calculateTotalScore(){
        int totalscore = 0;
        for(int i=0; i<5; i++)
            totalscore += scores[i];
        return totalscore;
        
    }
};
