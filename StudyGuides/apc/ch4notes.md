---
title: AP Calculus BC Chapter 4 Notes
author: Leo Zhang
---

# AP Calculus BC Chapter 4 Notes

## Fundamental Theorem of Calculus

### Part 1

If $f$ is continuous on $[a,b]$ and $F(x) = \int_{a}^{x} f(t) dt$, then $F'(x) = f(x)$ for all $x$ in $(a,b)$. Therefore, $\frac{d}{dx} \int_{a}^{x} f(t)dt = f(x)$.

### Part 2

If $F$ is any function such that the derivative $F'$ exists for all $x$ in an open interval containing $[a,b]$, then $\int_{a}^{b} f(x)dx = F(b)-F(a)$.

## Average Value Formula
To find the average y-value of a function over an interval [a,b], use the **average value formula**>

$$f_{\text{avg}}=\frac{1}{b-a}\int _{a}^{b}f(x)\,dx$$

The formula works in roughly the same way as calculating the mean of a set of numbers.

## Integral of 1/x

$\int_{0}^{x} \frac{1}{x} = \ln(|x|)$

## Newton's Method

1. Find two values within which there must be a zero by the Intermediate Value Theorem.

2. Pick a value $x_1$ within that range.

3. Use $x_{n+1} = x_n - \frac{f(x_n)}{f'(x_n)}$ to iterate through guesses.

4. When iterations are very close to previous ones, you have gotten a good estimate.
