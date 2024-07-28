#include <iostream>

using namespace std;

int main()
{
  char x;
  cin >> x;
  cout << char(x >= 97 ? x - 32 : x + 32) << endl;
  return 0;
}
