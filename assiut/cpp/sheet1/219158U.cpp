#include <iostream>
#include <string>

using namespace std;

int main()
{
  double n;
  cin >> n;
  cout << (n == int(n) ? "int " + to_string(int(n)) : "float " + to_string(int(n)) + " " + to_string(n - int(n))) << endl;
  return 0;
}
