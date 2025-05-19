(ns Lista-6.quadrante)

(defn quadrante [[x y]]
  (cond (and (> x 0) (> y 0)) "primeiro"
        (and (< x 0) (> y 0)) "segundo"
        (and (< x 0) (< y 0)) "terceiro"
        (and (> x 0) (< y 0)) "quarto"))

(defn parse [lista]
  (map #(Integer/parseInt %) (clojure.string/split lista #" ")))

(defn main []
  (let [lista (take-while (fn [[x y]] (not= (or x y) 0)) (repeatedly #(parse (read-line))))]
    (doall (map (fn [x] (println (quadrante x))) lista))))

(main)