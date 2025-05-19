(ns Lista-2.coordenadas)

(defn quadrante [x y]
  (cond (and (> x 0.0) (> y 0.0)) "Q1"
        (and (< x 0.0) (> y 0.0)) "Q2"
        (and (< x 0.0) (< y 0.0)) "Q3"
        (and (> x 0.0) (< y 0.0)) "Q4"
        (and (= x 0.0) (= y 0.0)) "Origem"
        (and (not= x 0.0) (= y 0.0)) "Eixo X"
        (and (= x 0.0) (not= y 0.0)) "Eixo Y"
        ))

(defn main []
  (let [entrada (clojure.string/split (read-line) #" ")
        x (Double/parseDouble (nth entrada 0))
        y (Double/parseDouble (nth entrada 1))]
    (println (quadrante x y))))

(main)

