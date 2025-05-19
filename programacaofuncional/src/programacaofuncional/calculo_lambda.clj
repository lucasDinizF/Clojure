(ns calculo_lambda)

(println (#(+ (* 2 %) 1) 3))

(println (((fn [x] (fn [y] (+ x y))) 5) 7))

(println (((fn [y] (fn [x] (+ x y))) 5) 7))

(println ((fn [x] (fn [y] (- x y))) (fn [z] (/ z 2))))

(println ((fn [x] x x) (fn [y] y)))

(println (((fn [x] (fn [y] (+ x (- 8 y)))) 5) 6))

(println (((fn [x] (fn [y] (- x y))) 9) 4))


