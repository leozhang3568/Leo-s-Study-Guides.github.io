# AP Calculus BC - Chapter 6 Notes

## Integrating with $u$-sub

### Integrating fractions which include $\ln(x)$


Ex.

$$
\int \frac{ln(x)}{x} dx
$$

Use $u$-substitution: $u = \ln(x)$

$\int \frac{ln(x)}{x} dx = \int u \cdot \frac{1}{x} dx = \int u \cdot du = \frac{u^2}{2} + C = \frac{\ln^2{(x)}}{2} + C$

### Rational function

Ex. $\int \frac{x^2}{x+1}dx$

Use polynomial division (synthetic division, in this case).

$=\int (x - 1 + \frac{1}{x+1})dx$

$=\frac{1}{2} x^2 - x + \ln(\lvert x+1\rvert) + C$


## Implicit Differentiation

When a function is defined by an equation containing $y$ and $x$ (y is not always isolated), it defines $y$ **implicitly**.

### How to show work clearly

Ex. $\frac{3}{5} x^{8}y = 8y + 5xy$

$$\frac{dy}{dx} (\frac{3}{5} x^{8}y = 8y + 5xy)$$

$$\frac{3}{5} (8x^7 y dx + x^8 dy) = 8dy + 5(ydx+xdy)$$
<div style="text-align:center;">&uarr;</div>
<div style="text-align:center;">
We are treating both $x$ and $y$ as functions whose derivatives are $dx$ and $dy$.
</div>

Factor out $dx$ and $dy$:

$$dx(\frac{24}{5}x^7y - 5y) + dy(\frac{3}{5} x^8 - 5x - 8) = 0$$

Isolate $\frac{dy}{dx}$:

$$\frac{dy}{dx} = -\frac{\frac{24}{5} x^7 y - 5y}{\frac{3}{5}x^8 - 5x - 8}$$

### Another way (much easier and more intuitive in my opinion)

$$\frac{3}{5}(8x^7 y + x^8 y') = 8y'+5(xy'+y)$$

The derivative of $y$ becomes $y'$. We don't differentiate $x$ using the chain rule. All we have to do is isolate $y'$!!

<br>

$$\frac{24}{5} x^7 y - 5y = 8y'+5xy' - \frac{3}{5} x^8 y' = y'(8+5x-\frac{3}{5} x^8)$$

$$y' = \frac{\frac{24}{5} x^7 y - 5y}{8+5x-\frac{3}{5}x^8} = -\frac{\frac{24}{5}x^7 y - 5y}{\frac{3}{5} x^8 - 5x - 8}$$


## Derivative of Exponential Functions

How to differentiate $y = 3^x$?

First, rewrite it in terms of $\ln$: $y = e^{x\ln(3)}$

Differentiate with the chain rule (remember that $\ln(3)$ is a constant!!): $\frac{dy}{dx} = \ln(3)(3^x)$

