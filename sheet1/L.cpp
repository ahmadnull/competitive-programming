#include <iostream>

using namespace std;

int main()
{
  string f[2], s[2];
  cin >> f[0] >> s[0] >> f[1] >> s[1];
  cout << (s[0] == s[1] ? "ARE Brothers" : "NOT") << endl;
  return 0;
}
