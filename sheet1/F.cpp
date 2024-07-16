#include <iostream>

using namespace std;

int main()
{
  string n, m;
  cin >> n >> m;
  cout << n[n.length() - 1] - '0' + m[m.length() - 1] - '0' << endl;
  return 0;
}
