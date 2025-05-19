(ns programacaofuncional.Soma)



;;(defn media [a b c] (/ (+ (+ (* a 2) (* b 3)) (* c 5)) 10))

;;(def a (read))
;;(def b (read))
;;(def c (read))

;;(println "MEDIA =" (format "%.1f" (media a b c)))

;;(def pi 3.14159)

;;(defn area [x] (* (* (/ 4.0 3) pi) (* x (* x x))))

;;(def x (read))

;;(println "VOLUME =" (format "%.3f" (area x)))


(defn consumo [x y]
  (/ x y))

(def x (read))
(def y (read))

(println (str (format "%.3f" (consumo x y)) " km/l") )