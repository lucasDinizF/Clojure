(ns Lista-2.triangulo)

(defn checar [a b c]
  (if (and (> a (Math/abs (- b c))) (< a (+ b c)))
    (if (and (> b (Math/abs (- a c))) (< b (+ a c)))
      (if (and (> c (Math/abs (- b c))) (< c (+ b a)))
        (let [p (+ a (+ b c))]
          (println (format "Perimetro = %.1f" p)))
        ))
    (let [area (/ (* (+ a b) c) 2)]
      (println (format "Area = %.1f" area)))))

(defn main []
  (let [entrada (clojure.string/split (read-line) #" ")
        a (Double/parseDouble (nth entrada 0))
        b (Double/parseDouble (nth entrada 1))
        c (Double/parseDouble (nth entrada 2))]
    (checar a b c)))

(main)