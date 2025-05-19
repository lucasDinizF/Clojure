(ns Lista-4.primos)

(defn primos [x]
    (cond (< x 2) (format "%d nao eh primo" x)
          (= x 2) (format "%d eh primo" x)
          (even? x) (format "%d nao eh primo" x)
          :else (if (> (count (filter zero? (map (fn [y] (mod x y)) (range 2  (inc (int (Math/sqrt x))))))) 0)
                  (format "%d nao eh primo" x)
                  (format "%d eh primo" x))
          ))

(defn main []
  (let [n (read)]
    (doall (map (fn [x] (println (primos x))) (repeatedly n read)))))

(main)