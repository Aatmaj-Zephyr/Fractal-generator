#include<iostream>

#include<fstream>

#include<stdio.h>

#include<cmath>

using namespace std;

struct complexfractal {
    //Make a struct named complex fractal. This is to make complex numbers in cpp. The complex numnbersd are interpreted as a seperate object class.
  double x, y, absolute_value;
  complexfractal() {
    x = 0;
    y = 0;
  }
  double compute(int length, double initial_x, double initial_y, double endlmt) {
    for (int i = length; i >= 0; i--) {
      if (absolut(x, y) < endlmt) {
        if (x * y != 0) {
          calculate(x, y, initial_x, initial_y); //void calculate

        } else {
          x = initial_x;
          y = initial_y;
        }

      } else {
        return 10;
      }
    }
    return absolut(x, y);
  }
  void calculate(double z_x, double z_y, double initial_x, double initial_y) {
      //Calculate ths distance between two complex numbers.
    x = (z_x) * (z_x) - (z_y) * (z_y) + initial_x; //z=z^2+C
    y = 2 * z_x * z_y + initial_y;
  }
  double absolut(double z_x, double z_y) {
      //absolute value of a complex number.
    return sqrt((z_x) * (z_x) + z_y * (z_y));
  }
};

int main() {
  ofstream fout;
  fout.open("fractal.txt");
  double endlmt = 2.0;
  int length = 500;
  int x_rightlimit = 500;
  int x_leftlimit = -200;
  int y_rightlimit = 100;
  int y_leftlimit = -100;
  int lr = 10;
  int x, y;
  for (int iy = y_leftlimit; iy < y_rightlimit; iy++) {
    y = iy / lr;
    for (int ix = x_leftlimit; ix < x_rightlimit; ix++) {
      x = ix / lr;
      complexfractal a;
      a.x = 0;
      a.y = 0;
      if (a.compute(length, x, y, endlmt) < endlmt) {
//fractal algorithm
        fout<<"*";
      } else {
        fout<<" ";
      }
    }
    fout<<"\n";
  }
  return 0;
}
