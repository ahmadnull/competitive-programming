#include <iostream>

using namespace std;

int main()
{
  int a, b, c;
  char s ,_q;
  cin >> a >> s >> b >> _q >> c;
  switch(s)
  {
    case '+':
      cout << (a + b == c ? "Yes" : to_string(a + b)) << endl;
      break;
    case '-':
      cout << (a - b == c ? "Yes" : to_string(a - b)) << endl;
      break;
    case '*':
      cout << (a * b == c ? "Yes" : to_string(a * b)) << endl;
      break;
  }
  return 0;
}
