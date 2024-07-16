#include <iostream>

using namespace std;

int main()
{
  char x;
  cin >> x;
  cout << (x >= 65 ? "ALPHA\n" + string(x >= 97 ? "IS SMALL" : "IS CAPITAL") : "IS DIGIT") << endl;
  return 0;
}
