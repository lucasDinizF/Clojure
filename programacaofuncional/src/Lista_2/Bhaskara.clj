(ns Lista-2.Bhaskara)


(defn baskhara [a b c]
  (if (zero? a)
    (println "Impossivel calcular")
    (let [delta (- (* b b) (* 4 a c))]
      (if (neg? delta)
        (println "Impossivel calcular")
        (let [raiz (Math/sqrt delta)
              R1 (/ (- (- b) raiz) (* 2 a))
              R2 (/ (+ (- b) raiz) (* 2 a))]
          (println (format "R1 = %.5f" R2))
          (println (format "R2 = %.5f" R1)))))))


(defn main []
  (let [a (read)
        b (read)
        c (read)]
        (baskhara a b c)))

(main)
