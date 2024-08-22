#include <iostream>

using namespace std;

int main()
{
  int a, b;
  char s;
  cin >> a >> s >> b;
  switch(s)
  {
    case '=':
      cout << (a == b ? "Right" : "Wrong") << endl;
      break;
    case '>':
      cout << (a > b ? "Right" : "Wrong") << endl;
      break;
    case '<':
      cout << (a < b ? "Right" : "Wrong") << endl;
      break;
  }
  return 0;
}
