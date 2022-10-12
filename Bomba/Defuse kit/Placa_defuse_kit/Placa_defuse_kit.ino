int state = 2; // Initializeaza starea modulului bluetooth



void setup(){

  Serial.begin(9600);  //incepe comunicarea intre module la rata setata
}

void loop(){

   if(Serial.available() > 0){ //verifica daca datele sunt trimise
    state = Serial.read();} //citeste datele trimise
 
if (state==2) {                     //in cazul in care se conecteaza
   Serial.write('1');               //este trimis '1' catre master drept stare pentru a executa codul
 }
 else {
   Serial.write('0');               //se executa a doua bucata de cod in cazul in care conexiunea nu a avut loc
 }  


}
