(ns programacaofuncional.core)


;;(def a (read))
;;(def b (read))

;;(println "X =" (+ a b))


(def pi 3.14159)

(defn area [x]
  (* pi (* x x)))

(def x (read))

(println (str "A=" (format "%.4f" (area x))))

