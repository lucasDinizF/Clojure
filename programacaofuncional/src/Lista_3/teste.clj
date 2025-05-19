(ns Lista-3.teste)

(def quantidade (read))

(def numeros (repeatedly quantidade read))

(defn metodo_1 [valor]
  (def data (- 2015 valor))
  (if (> data 0)
    (println (Math/abs data) "D.C")
    (println (+ (Math/abs data) 1) "A.C")))

(doall (map metodo_1 numeros))