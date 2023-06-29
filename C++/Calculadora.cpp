//#include "MyCode.h" = My own file containing libraries and other things

#include <iostream>

using namespace std;

int opc, num1, num2;

void menu() {
	system("cls");
	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t|           Menu for basic Calculator          |\t" << endl;
	cout << "\t|----------------------------------------------|\t" << endl;
	cout << "\t|                  1. SUMA                     |\t" << endl;
	cout << "\t|                  2. RESTA                    |\t" << endl;
	cout << "\t|             3. MULTIPLICACION                |\t" << endl;
	cout << "\t|                 4. DIVISION                  |\t" << endl;
	cout << "\t|                  5. EXIT                     |\t" << endl;
	cout << "\t|______________________________________________|\t" << endl;
	cout << "\tChoose any number for the operation you want: "; cin >> opc;
}

void suma() {

	system("cls"); system("color 07");

	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t|                   SUMA                       |\t" << endl;
	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t enter the 1st number: "; cin >> num1;
	cout << "\t enter the 2nd number: "; cin >> num2;
	int sum = num1 + num2;
	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t El resultado de la suma es: " << sum << endl;
	cout << "\t ---------------------------------------------- \t" << endl;

	system("pause");
}

void resta() {

	system("cls"); system("color 07");

	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t|                   RESTA                      |\t" << endl;
	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t enter the 1st number: "; cin >> num1;
	cout << "\t enter the 2nd number: "; cin >> num2;
	int res = num1 - num2;
	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t	El resultado de la resta es: " << res << endl;
	cout << "\t ---------------------------------------------- \t" << endl;

	system("pause");
}

void multiplicacion() {

	system("cls"); system("color 07");

	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t|                MULTIPLICACION                |\t" << endl;
	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t enter the 1st number: "; cin >> num1;
	cout << "\t enter the 2nd number: "; cin >> num2;
	int mul = num1 * num2;
	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t El resultado de la multiplicacion es: " << mul << endl;
	cout << "\t ---------------------------------------------- \t" << endl;

	system("pause");
}

void division() {

	system("cls"); system("color 07");

	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t|                   DIVISION                   |\t" << endl;
	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t enter the 1st number: "; cin >> num1;
	cout << "\t enter the 2nd number: "; cin >> num2;
	int div = num1 / num2;
	cout << "\t ---------------------------------------------- \t" << endl;
	cout << "\t El resultado de la divison es: " << div << endl;
	cout << "\t ---------------------------------------------- \t" << endl;

	system("pause");
}

void exit() {
	
	system("cls"); system("color 09");

	cout << "thx for use this calculator ;)" << endl;

	system("exit");
}

int main() {

	do{
		menu();

		switch (opc) {
			case 1:
				suma();
				break;

			case 2:
				resta();
				break;

			case 3:
				multiplicacion();
				break;

			case 4:
				division();
				break;

			case 5:
				exit();
				break;

			default:
				system("color 04");
				cout << "\twrong choice :( try again: ";
				break;
		}
	} while (opc != 5);

	return 0;
}
