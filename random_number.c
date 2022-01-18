#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main(){
   int number,guesses,nguesses;
   srand(time(0));
   number=rand()%100+1;
   do{
       printf("guess the number between 1 to 100\n");
       scanf("%d",&guesses);

       if(guesses>number){
           printf("lower numbwer please!\n");
       }
       else if(guesses<number){
           printf("higher number please!\n");
       }
       else{
           printf("you guessed it in %d attempts",nguesses);
       }
       nguesses++;
   }while(guesses!=number);
   return 0;


}